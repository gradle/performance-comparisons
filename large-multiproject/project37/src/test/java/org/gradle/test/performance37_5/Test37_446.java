package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_446 {
    private final Production37_446 production = new Production37_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}