package nl.strohalm.cyclos.entities.accounts.external.filemapping;

import nl.strohalm.cyclos.entities.converters.StringValuedEnumAttributeConverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class FieldAttributeConverter extends StringValuedEnumAttributeConverter<FieldMapping.Field>
    /* https://bugs.eclipse.org/bugs/show_bug.cgi?id=415296 */ implements AttributeConverter<FieldMapping.Field, String> {
}
