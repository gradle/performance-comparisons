package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_16 {
    private final Production1_16 production = new Production1_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}