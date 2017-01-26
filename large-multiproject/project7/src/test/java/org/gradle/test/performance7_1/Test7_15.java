package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_15 {
    private final Production7_15 production = new Production7_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}