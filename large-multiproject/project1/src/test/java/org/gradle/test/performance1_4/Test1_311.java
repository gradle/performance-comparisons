package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_311 {
    private final Production1_311 production = new Production1_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}