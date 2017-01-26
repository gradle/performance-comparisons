package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_84 {
    private final Production1_84 production = new Production1_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}