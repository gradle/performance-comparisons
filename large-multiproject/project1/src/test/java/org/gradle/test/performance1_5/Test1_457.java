package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_457 {
    private final Production1_457 production = new Production1_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}