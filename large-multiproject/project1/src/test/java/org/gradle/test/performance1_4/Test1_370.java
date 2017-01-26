package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_370 {
    private final Production1_370 production = new Production1_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}