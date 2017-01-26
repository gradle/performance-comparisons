package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_440 {
    private final Production3_440 production = new Production3_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}