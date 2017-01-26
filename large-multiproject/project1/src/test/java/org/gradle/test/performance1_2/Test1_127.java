package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_127 {
    private final Production1_127 production = new Production1_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}