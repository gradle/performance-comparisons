package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_30 {
    private final Production1_30 production = new Production1_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}