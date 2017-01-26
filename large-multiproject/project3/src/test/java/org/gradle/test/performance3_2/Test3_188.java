package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_188 {
    private final Production3_188 production = new Production3_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}