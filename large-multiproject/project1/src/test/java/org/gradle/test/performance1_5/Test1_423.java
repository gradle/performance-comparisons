package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_423 {
    private final Production1_423 production = new Production1_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}