package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_9 {
    private final Production1_9 production = new Production1_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}