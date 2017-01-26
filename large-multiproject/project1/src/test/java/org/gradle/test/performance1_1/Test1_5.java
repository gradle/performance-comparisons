package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_5 {
    private final Production1_5 production = new Production1_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}