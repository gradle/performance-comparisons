package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_325 {
    private final Production3_325 production = new Production3_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}