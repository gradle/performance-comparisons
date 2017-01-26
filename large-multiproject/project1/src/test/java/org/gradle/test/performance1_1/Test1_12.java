package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_12 {
    private final Production1_12 production = new Production1_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}