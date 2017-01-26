package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_403 {
    private final Production20_403 production = new Production20_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}