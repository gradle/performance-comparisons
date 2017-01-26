package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_324 {
    private final Production1_324 production = new Production1_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}