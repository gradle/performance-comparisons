package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_74 {
    private final Production93_74 production = new Production93_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}