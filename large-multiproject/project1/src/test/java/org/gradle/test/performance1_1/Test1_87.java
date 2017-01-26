package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_87 {
    private final Production1_87 production = new Production1_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}