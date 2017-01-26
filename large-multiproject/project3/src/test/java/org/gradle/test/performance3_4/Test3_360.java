package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_360 {
    private final Production3_360 production = new Production3_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}