package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_228 {
    private final Production3_228 production = new Production3_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}