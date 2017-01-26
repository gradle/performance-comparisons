package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_70 {
    private final Production1_70 production = new Production1_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}