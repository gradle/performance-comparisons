package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_92 {
    private final Production1_92 production = new Production1_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}