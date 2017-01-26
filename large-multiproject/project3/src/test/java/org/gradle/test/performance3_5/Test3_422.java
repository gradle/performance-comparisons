package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_422 {
    private final Production3_422 production = new Production3_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}