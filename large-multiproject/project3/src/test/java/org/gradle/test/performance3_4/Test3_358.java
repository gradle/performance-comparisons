package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_358 {
    private final Production3_358 production = new Production3_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}