package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_481 {
    private final Production3_481 production = new Production3_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}