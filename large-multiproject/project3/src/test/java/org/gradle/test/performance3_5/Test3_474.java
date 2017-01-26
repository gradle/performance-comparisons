package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_474 {
    private final Production3_474 production = new Production3_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}