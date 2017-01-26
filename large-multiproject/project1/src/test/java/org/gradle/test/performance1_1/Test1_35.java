package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_35 {
    private final Production1_35 production = new Production1_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}