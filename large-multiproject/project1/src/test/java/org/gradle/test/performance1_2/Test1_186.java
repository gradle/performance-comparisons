package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_186 {
    private final Production1_186 production = new Production1_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}