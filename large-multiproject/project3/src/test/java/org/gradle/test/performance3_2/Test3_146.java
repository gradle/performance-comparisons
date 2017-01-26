package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_146 {
    private final Production3_146 production = new Production3_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}