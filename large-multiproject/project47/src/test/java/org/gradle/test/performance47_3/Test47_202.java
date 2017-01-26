package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_202 {
    private final Production47_202 production = new Production47_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}