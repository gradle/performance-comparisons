package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_15 {
    private final Production20_15 production = new Production20_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}