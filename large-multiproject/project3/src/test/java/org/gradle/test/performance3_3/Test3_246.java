package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_246 {
    private final Production3_246 production = new Production3_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}