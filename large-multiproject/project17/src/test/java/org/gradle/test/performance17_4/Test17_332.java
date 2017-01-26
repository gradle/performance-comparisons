package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_332 {
    private final Production17_332 production = new Production17_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}