package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_158 {
    private final Production3_158 production = new Production3_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}