package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_140 {
    private final Production1_140 production = new Production1_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}