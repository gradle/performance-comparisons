package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_301 {
    private final Production1_301 production = new Production1_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}