package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_19 {
    private final Production17_19 production = new Production17_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}