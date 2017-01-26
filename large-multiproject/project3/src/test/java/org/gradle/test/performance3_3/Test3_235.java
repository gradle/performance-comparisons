package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_235 {
    private final Production3_235 production = new Production3_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}