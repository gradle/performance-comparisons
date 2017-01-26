package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_15 {
    private final Production3_15 production = new Production3_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}