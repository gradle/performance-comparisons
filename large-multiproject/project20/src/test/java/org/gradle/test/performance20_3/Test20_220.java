package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_220 {
    private final Production20_220 production = new Production20_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}