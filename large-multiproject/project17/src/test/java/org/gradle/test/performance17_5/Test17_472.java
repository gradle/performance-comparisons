package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_472 {
    private final Production17_472 production = new Production17_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}