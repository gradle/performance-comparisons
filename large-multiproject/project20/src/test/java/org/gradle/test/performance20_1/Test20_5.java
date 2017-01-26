package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_5 {
    private final Production20_5 production = new Production20_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}