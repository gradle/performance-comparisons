package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_405 {
    private final Production1_405 production = new Production1_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}