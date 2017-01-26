package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_317 {
    private final Production1_317 production = new Production1_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}