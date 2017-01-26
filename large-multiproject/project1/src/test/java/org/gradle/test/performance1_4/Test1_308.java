package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_308 {
    private final Production1_308 production = new Production1_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}