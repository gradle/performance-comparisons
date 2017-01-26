package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_1 {
    private final Production20_1 production = new Production20_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}