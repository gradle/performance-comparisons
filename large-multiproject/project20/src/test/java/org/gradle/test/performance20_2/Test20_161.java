package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_161 {
    private final Production20_161 production = new Production20_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}