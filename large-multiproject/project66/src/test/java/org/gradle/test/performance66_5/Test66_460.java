package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_460 {
    private final Production66_460 production = new Production66_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}