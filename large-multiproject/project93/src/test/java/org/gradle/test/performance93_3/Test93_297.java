package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_297 {
    private final Production93_297 production = new Production93_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}