package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_364 {
    private final Production1_364 production = new Production1_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}