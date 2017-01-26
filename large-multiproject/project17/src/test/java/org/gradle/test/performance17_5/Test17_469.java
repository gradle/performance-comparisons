package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_469 {
    private final Production17_469 production = new Production17_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}