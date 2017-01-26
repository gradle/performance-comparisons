package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_10 {
    private final Production3_10 production = new Production3_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}