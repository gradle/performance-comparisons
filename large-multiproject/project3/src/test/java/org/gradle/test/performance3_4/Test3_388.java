package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_388 {
    private final Production3_388 production = new Production3_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}