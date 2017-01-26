package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_423 {
    private final Production20_423 production = new Production20_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}