package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_419 {
    private final Production3_419 production = new Production3_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}