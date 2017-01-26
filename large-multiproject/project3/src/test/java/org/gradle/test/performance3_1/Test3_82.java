package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_82 {
    private final Production3_82 production = new Production3_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}