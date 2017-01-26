package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_470 {
    private final Production17_470 production = new Production17_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}