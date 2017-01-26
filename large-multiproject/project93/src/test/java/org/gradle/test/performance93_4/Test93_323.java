package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_323 {
    private final Production93_323 production = new Production93_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}