package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_418 {
    private final Production3_418 production = new Production3_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}