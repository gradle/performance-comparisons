package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_334 {
    private final Production20_334 production = new Production20_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}