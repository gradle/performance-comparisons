package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_63 {
    private final Production20_63 production = new Production20_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}