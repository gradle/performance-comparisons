package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_34 {
    private final Production1_34 production = new Production1_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}