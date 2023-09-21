using HelseID.Samples.Configuration;

const string allowSpecificOrigins = "_allowSpecificOrigins";

var builder = WebApplication.CreateBuilder(args);

builder.Services.AddControllers();
builder.Services.AddCors(options =>
{
    options.AddPolicy(allowSpecificOrigins,
        policy =>
        {
            policy.WithOrigins("https://localhost:5081")
                .AllowAnyHeader();
        });
});

builder.WebHost.ConfigureKestrel(option =>
{
    option.ListenLocalhost(ConfigurationValues.TestTokenProxyServerPort, listenOptions => listenOptions.UseHttps());
});

var app = builder.Build();

app.UseHttpsRedirection();
app.UseRouting();
app.UseCors(allowSpecificOrigins);
app.MapControllers();
app.Run();
