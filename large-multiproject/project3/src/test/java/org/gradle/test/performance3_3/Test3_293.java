package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_293 {
    private final Production3_293 production = new Production3_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}