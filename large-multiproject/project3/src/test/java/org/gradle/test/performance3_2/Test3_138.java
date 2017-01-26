package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_138 {
    private final Production3_138 production = new Production3_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}