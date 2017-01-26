package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_325 {
    private final Production84_325 production = new Production84_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}