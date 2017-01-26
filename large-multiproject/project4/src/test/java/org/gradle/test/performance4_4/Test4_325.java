package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_325 {
    private final Production4_325 production = new Production4_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}