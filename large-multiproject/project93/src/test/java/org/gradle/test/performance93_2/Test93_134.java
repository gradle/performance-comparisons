package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_134 {
    private final Production93_134 production = new Production93_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}