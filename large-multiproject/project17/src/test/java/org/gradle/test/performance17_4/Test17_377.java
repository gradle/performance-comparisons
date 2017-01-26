package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_377 {
    private final Production17_377 production = new Production17_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}