package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_477 {
    private final Production3_477 production = new Production3_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}