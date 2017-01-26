package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_400 {
    private final Production17_400 production = new Production17_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}