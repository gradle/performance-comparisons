package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_482 {
    private final Production1_482 production = new Production1_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}