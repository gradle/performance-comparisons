package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_109 {
    private final Production1_109 production = new Production1_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}