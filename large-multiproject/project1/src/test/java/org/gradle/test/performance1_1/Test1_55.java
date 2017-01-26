package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_55 {
    private final Production1_55 production = new Production1_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}