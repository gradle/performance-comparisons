package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_6 {
    private final Production1_6 production = new Production1_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}