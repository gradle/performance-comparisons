package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_171 {
    private final Production3_171 production = new Production3_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}