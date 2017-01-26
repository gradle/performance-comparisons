package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_343 {
    private final Production3_343 production = new Production3_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}