package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_482 {
    private final Production20_482 production = new Production20_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}