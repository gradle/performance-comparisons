package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_261 {
    private final Production17_261 production = new Production17_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}