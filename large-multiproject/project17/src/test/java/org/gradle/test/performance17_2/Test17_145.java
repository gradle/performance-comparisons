package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_145 {
    private final Production17_145 production = new Production17_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}