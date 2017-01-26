package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_180 {
    private final Production1_180 production = new Production1_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}