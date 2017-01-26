package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_229 {
    private final Production3_229 production = new Production3_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}