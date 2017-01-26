package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_329 {
    private final Production3_329 production = new Production3_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}