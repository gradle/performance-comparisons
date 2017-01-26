package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_289 {
    private final Production3_289 production = new Production3_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}