package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_460 {
    private final Production71_460 production = new Production71_460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}