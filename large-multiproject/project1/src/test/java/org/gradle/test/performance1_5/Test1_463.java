package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_463 {
    private final Production1_463 production = new Production1_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}