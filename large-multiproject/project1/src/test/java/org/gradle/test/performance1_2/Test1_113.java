package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_113 {
    private final Production1_113 production = new Production1_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}