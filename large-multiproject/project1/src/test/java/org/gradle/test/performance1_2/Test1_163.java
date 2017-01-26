package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_163 {
    private final Production1_163 production = new Production1_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}