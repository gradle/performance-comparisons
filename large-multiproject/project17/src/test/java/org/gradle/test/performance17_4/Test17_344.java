package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_344 {
    private final Production17_344 production = new Production17_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}