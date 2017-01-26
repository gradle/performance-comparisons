package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_328 {
    private final Production1_328 production = new Production1_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}