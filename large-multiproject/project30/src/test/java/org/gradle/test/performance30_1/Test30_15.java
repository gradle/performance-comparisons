package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_15 {
    private final Production30_15 production = new Production30_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}