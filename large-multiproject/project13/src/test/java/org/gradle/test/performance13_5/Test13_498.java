package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_498 {
    private final Production13_498 production = new Production13_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}