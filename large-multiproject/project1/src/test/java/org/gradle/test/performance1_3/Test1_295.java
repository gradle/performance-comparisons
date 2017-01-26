package org.gradle.test.performance1_3;

import static org.junit.Assert.*;

public class Test1_295 {
    private final Production1_295 production = new Production1_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}