package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_29 {
    private final Production3_29 production = new Production3_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}