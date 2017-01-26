package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_209 {
    private final Production47_209 production = new Production47_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}