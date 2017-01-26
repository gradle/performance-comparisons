package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_93 {
    private final Production47_93 production = new Production47_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}