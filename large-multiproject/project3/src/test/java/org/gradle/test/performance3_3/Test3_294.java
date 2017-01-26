package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_294 {
    private final Production3_294 production = new Production3_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}