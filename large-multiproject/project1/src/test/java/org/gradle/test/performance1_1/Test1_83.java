package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_83 {
    private final Production1_83 production = new Production1_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}