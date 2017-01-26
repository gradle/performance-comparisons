package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_321 {
    private final Production1_321 production = new Production1_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}