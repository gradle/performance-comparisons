package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_162 {
    private final Production20_162 production = new Production20_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}