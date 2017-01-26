package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_182 {
    private final Production1_182 production = new Production1_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}