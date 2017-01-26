package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_498 {
    private final Production47_498 production = new Production47_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}