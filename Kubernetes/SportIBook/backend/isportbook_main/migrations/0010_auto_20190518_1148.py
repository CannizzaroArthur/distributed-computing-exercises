# Generated by Django 2.2.1 on 2019-05-18 11:48

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('isportbook_main', '0009_booking_uuid'),
    ]

    operations = [
        migrations.AlterField(
            model_name='booking',
            name='uuid',
            field=models.UUIDField(blank=True, default=None, null=True, unique=True),
        ),
    ]
