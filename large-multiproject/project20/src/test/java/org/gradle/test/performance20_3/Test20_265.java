package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_265 {
    private final Production20_265 production = new Production20_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}