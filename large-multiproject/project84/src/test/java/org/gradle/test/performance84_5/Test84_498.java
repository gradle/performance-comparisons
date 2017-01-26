package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_498 {
    private final Production84_498 production = new Production84_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}