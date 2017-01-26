package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_14 {
    private final Production3_14 production = new Production3_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}