package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_91 {
    private final Production3_91 production = new Production3_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}