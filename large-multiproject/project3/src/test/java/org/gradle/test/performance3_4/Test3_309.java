package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_309 {
    private final Production3_309 production = new Production3_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}