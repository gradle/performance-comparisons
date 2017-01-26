package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_139 {
    private final Production17_139 production = new Production17_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}