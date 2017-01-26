package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_225 {
    private final Production47_225 production = new Production47_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}