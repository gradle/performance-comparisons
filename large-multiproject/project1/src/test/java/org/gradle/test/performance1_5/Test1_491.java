package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_491 {
    private final Production1_491 production = new Production1_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}