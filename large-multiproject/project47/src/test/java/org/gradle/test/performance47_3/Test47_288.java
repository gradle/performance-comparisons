package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_288 {
    private final Production47_288 production = new Production47_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}