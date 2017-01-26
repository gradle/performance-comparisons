package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_482 {
    private final Production17_482 production = new Production17_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}