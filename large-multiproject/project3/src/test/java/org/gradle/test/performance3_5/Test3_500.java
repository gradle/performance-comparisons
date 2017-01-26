package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_500 {
    private final Production3_500 production = new Production3_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}