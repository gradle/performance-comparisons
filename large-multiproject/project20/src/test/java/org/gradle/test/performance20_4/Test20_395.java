package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_395 {
    private final Production20_395 production = new Production20_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}