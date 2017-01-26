package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_95 {
    private final Production1_95 production = new Production1_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}