# Generated by Django 2.2.1 on 2019-05-18 21:52

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('isportbook_main', '0013_auto_20190518_2138'),
    ]

    operations = [
        migrations.AlterField(
            model_name='sport',
            name='icon',
            field=models.ImageField(null=True, upload_to='uploads/'),
        ),
    ]
