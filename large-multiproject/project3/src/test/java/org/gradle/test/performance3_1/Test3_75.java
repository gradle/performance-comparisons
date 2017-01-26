package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_75 {
    private final Production3_75 production = new Production3_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}