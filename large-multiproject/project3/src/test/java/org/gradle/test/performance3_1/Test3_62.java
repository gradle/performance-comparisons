package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_62 {
    private final Production3_62 production = new Production3_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}