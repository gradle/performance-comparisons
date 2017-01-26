package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_19 {
    private final Production1_19 production = new Production1_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}