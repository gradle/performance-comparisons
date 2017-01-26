package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_446 {
    private final Production20_446 production = new Production20_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}