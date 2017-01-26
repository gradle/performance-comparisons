package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_436 {
    private final Production1_436 production = new Production1_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}