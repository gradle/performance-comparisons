package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_147 {
    private final Production3_147 production = new Production3_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}