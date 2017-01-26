package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_438 {
    private final Production17_438 production = new Production17_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}