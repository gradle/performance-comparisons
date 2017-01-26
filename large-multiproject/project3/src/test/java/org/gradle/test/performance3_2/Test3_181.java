package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_181 {
    private final Production3_181 production = new Production3_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}