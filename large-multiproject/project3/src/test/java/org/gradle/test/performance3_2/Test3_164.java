package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_164 {
    private final Production3_164 production = new Production3_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}