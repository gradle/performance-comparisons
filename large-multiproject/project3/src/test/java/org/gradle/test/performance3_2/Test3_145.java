package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_145 {
    private final Production3_145 production = new Production3_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}