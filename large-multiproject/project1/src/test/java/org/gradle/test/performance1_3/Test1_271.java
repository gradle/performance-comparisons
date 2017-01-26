package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_271 {
    private final Production1_271 production = new Production1_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}