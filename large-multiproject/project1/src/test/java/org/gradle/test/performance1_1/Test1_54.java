package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_54 {
    private final Production1_54 production = new Production1_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}