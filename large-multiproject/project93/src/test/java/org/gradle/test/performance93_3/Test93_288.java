package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_288 {
    private final Production93_288 production = new Production93_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}