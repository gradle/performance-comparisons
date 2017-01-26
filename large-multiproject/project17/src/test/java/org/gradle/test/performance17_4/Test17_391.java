package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_391 {
    private final Production17_391 production = new Production17_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}