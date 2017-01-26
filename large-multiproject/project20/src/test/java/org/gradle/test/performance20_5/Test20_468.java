package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_468 {
    private final Production20_468 production = new Production20_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}