package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_199 {
    private final Production3_199 production = new Production3_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}