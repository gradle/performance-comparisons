package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_80 {
    private final Production3_80 production = new Production3_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}