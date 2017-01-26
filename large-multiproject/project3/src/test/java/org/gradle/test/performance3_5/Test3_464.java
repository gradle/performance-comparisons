package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_464 {
    private final Production3_464 production = new Production3_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}