/*Returns the sum of all people living in Asian cities*/
SELECT SUM(City.Population) FROM City
JOIN Country ON City.CountryCode = Country.Code
WHERE Country.Continent = 'Asia';
