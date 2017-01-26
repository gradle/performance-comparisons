package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_199 {
    private final Production1_199 production = new Production1_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}