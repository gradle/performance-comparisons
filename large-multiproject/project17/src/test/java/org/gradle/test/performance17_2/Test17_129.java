package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_129 {
    private final Production17_129 production = new Production17_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}