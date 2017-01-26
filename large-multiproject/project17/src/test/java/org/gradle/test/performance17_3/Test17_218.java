package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_218 {
    private final Production17_218 production = new Production17_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}