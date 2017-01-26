package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_200 {
    private final Production3_200 production = new Production3_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}