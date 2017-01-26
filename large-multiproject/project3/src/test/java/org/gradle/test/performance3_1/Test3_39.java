package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_39 {
    private final Production3_39 production = new Production3_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}