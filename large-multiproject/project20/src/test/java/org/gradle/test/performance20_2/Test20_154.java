package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_154 {
    private final Production20_154 production = new Production20_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}