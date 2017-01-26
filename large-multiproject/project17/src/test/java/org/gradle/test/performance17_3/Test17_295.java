package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_295 {
    private final Production17_295 production = new Production17_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}