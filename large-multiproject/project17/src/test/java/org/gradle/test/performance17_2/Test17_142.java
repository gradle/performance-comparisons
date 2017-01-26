package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_142 {
    private final Production17_142 production = new Production17_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}