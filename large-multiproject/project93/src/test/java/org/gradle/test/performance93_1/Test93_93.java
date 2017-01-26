package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_93 {
    private final Production93_93 production = new Production93_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}