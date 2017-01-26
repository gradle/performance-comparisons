package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_104 {
    private final Production3_104 production = new Production3_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}