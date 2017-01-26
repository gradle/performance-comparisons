package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_98 {
    private final Production3_98 production = new Production3_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}