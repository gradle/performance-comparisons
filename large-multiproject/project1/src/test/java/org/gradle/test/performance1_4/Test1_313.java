package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_313 {
    private final Production1_313 production = new Production1_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}