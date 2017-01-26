package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_398 {
    private final Production1_398 production = new Production1_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}