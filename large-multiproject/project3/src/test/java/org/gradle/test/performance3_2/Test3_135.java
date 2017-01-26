package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_135 {
    private final Production3_135 production = new Production3_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}