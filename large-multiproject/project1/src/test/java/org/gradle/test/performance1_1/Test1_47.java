package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_47 {
    private final Production1_47 production = new Production1_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}