package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_445 {
    private final Production93_445 production = new Production93_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}