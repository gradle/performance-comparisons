package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_205 {
    private final Production17_205 production = new Production17_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}