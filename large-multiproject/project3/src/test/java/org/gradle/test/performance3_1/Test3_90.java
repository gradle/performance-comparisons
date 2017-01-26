package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_90 {
    private final Production3_90 production = new Production3_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}