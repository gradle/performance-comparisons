package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_188 {
    private final Production1_188 production = new Production1_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}