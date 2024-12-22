# Flint From Gravel Plugin

A simple Minecraft plugin that adds a crafting recipe to convert gravel into flint using a crafting table. Designed for Minecraft 1.21 and built with the Spigot API.

## Features

- Adds a custom crafting recipe to create flint from gravel.
- Supports Minecraft version 1.21.
- Lightweight and easy to install.

## Crafting Recipe

To craft flint, place three gravel blocks vertically in a column in a crafting table:
```
[G] [ ] [ ]
[G] [ ] [ ]
[G] [ ] [ ]
```
`G` = Gravel

Result: 1 Flint

## Installation

1. Download the latest version of the plugin from the [Releases](https://github.com/Vabolos/Gravel-to-Flint/releases) page.
2. Place the downloaded `.jar` file into the `plugins` folder of your Spigot or PaperMC server.
3. Restart your server.
4. Enjoy the new crafting recipe!

## Development Setup

### Prerequisites

- Java JDK 17 or higher
- Maven
- Spigot API for Minecraft 1.21

### Building the Plugin

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/flint-from-gravel.git
   cd flint-from-gravel
   ```
2. Compile and package the plugin:
   ```bash
   mvn clean package
   ```
3. The compiled `.jar` file will be located in the `target` directory.

### Adding Spigot API Dependency

Add the following dependency to your `pom.xml`:
```xml
<dependency>
    <groupId>org.spigotmc</groupId>
    <artifactId>spigot-api</artifactId>
    <version>1.21-R0.1-SNAPSHOT</version>
    <scope>provided</scope>
</dependency>
```

## License

This project is licensed under the [MIT License](LICENSE).

## Contributions

Contributions are welcome! Please submit a pull request or open an issue if you have suggestions or find bugs.

## Support

If you encounter any issues or have questions, please open an issue in the [GitHub repository](https://github.com/Vabolos/flint-from-gravel/issues).

---

Enjoy crafting flint and simplifying your Minecraft gameplay!

