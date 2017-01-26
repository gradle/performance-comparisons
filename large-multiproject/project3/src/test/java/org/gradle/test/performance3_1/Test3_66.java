package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_66 {
    private final Production3_66 production = new Production3_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}