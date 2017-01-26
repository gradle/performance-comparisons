package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_259 {
    private final Production1_259 production = new Production1_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}