package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_112 {
    private final Production1_112 production = new Production1_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}