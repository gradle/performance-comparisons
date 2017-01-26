package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_87 {
    private final Production20_87 production = new Production20_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}