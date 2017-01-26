package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_107 {
    private final Production93_107 production = new Production93_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}