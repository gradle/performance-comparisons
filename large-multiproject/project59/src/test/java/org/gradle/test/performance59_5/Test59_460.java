package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_460 {
    private final Production59_460 production = new Production59_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}