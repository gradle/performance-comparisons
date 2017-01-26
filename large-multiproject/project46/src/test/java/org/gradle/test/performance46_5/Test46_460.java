package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_460 {
    private final Production46_460 production = new Production46_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}