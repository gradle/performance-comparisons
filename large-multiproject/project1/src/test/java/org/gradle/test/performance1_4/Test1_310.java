package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_310 {
    private final Production1_310 production = new Production1_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}