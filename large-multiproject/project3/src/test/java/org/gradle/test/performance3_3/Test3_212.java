package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_212 {
    private final Production3_212 production = new Production3_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}