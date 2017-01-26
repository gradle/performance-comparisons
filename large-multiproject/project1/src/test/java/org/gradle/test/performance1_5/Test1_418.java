package org.gradle.test.performance1_5;

import static org.junit.Assert.*;

public class Test1_418 {
    private final Production1_418 production = new Production1_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}