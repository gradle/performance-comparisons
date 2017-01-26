package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_377 {
    private final Production1_377 production = new Production1_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}