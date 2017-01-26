package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_88 {
    private final Production3_88 production = new Production3_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}