package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_106 {
    private final Production1_106 production = new Production1_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}