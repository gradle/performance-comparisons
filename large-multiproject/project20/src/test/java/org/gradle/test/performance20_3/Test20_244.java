package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_244 {
    private final Production20_244 production = new Production20_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}