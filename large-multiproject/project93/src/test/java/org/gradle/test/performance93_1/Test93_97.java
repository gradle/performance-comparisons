package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_97 {
    private final Production93_97 production = new Production93_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}