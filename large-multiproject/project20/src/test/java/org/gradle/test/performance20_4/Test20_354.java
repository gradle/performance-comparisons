package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_354 {
    private final Production20_354 production = new Production20_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}