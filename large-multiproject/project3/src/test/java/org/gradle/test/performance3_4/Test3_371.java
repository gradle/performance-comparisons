package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_371 {
    private final Production3_371 production = new Production3_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}