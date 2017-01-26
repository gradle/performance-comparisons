package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_401 {
    private final Production1_401 production = new Production1_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}