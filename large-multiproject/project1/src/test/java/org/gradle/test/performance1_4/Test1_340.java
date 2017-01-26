package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_340 {
    private final Production1_340 production = new Production1_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}