package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_161 {
    private final Production1_161 production = new Production1_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}