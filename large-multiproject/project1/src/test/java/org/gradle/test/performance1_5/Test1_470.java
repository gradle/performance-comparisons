package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_470 {
    private final Production1_470 production = new Production1_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}