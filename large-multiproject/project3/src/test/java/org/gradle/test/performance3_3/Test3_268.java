package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_268 {
    private final Production3_268 production = new Production3_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}