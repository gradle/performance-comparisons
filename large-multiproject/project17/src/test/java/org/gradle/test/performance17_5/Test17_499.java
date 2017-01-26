package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_499 {
    private final Production17_499 production = new Production17_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}