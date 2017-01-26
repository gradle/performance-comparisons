package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_276 {
    private final Production17_276 production = new Production17_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}