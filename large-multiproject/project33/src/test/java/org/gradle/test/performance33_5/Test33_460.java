package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_460 {
    private final Production33_460 production = new Production33_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}