package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_9 {
    private final Production3_9 production = new Production3_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}