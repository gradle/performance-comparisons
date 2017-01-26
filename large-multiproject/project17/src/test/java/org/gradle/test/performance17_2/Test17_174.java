package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_174 {
    private final Production17_174 production = new Production17_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}