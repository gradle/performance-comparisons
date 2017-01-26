package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_410 {
    private final Production1_410 production = new Production1_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}