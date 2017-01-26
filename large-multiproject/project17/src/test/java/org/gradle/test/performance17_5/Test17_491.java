package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_491 {
    private final Production17_491 production = new Production17_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}