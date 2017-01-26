package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_137 {
    private final Production3_137 production = new Production3_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}