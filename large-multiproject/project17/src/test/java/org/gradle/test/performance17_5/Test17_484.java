package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_484 {
    private final Production17_484 production = new Production17_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}