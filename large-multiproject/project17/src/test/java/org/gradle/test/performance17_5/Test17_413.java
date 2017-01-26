package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_413 {
    private final Production17_413 production = new Production17_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}