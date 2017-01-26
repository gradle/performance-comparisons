package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_218 {
    private final Production1_218 production = new Production1_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}