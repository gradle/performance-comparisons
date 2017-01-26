package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_390 {
    private final Production3_390 production = new Production3_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}