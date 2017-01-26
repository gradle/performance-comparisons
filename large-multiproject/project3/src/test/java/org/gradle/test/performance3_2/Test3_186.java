package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_186 {
    private final Production3_186 production = new Production3_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}