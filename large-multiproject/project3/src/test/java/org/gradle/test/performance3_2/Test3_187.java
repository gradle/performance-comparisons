package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_187 {
    private final Production3_187 production = new Production3_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}