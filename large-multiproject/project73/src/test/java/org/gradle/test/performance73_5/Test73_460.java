package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_460 {
    private final Production73_460 production = new Production73_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}