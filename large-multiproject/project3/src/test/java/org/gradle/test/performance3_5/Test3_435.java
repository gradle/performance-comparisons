package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_435 {
    private final Production3_435 production = new Production3_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}