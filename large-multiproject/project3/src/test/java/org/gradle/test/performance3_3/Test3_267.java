package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_267 {
    private final Production3_267 production = new Production3_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}