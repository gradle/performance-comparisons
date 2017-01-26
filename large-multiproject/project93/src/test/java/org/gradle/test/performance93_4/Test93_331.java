package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_331 {
    private final Production93_331 production = new Production93_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}