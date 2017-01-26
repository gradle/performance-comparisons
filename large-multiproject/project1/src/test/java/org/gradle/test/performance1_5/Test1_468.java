package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_468 {
    private final Production1_468 production = new Production1_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}