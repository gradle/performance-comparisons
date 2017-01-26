package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_460 {
    private final Production91_460 production = new Production91_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}