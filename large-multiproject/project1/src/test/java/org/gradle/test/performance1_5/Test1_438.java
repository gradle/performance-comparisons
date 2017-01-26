package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_438 {
    private final Production1_438 production = new Production1_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}