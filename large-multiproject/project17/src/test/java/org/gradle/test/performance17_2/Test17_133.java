package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_133 {
    private final Production17_133 production = new Production17_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}