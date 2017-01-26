package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_213 {
    private final Production20_213 production = new Production20_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}