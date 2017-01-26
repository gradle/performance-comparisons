package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_122 {
    private final Production1_122 production = new Production1_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}