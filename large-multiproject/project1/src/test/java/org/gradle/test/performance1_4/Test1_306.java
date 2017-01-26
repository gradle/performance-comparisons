package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_306 {
    private final Production1_306 production = new Production1_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}