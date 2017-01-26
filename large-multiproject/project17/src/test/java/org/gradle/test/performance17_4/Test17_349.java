package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_349 {
    private final Production17_349 production = new Production17_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}