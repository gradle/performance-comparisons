package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_48 {
    private final Production3_48 production = new Production3_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}