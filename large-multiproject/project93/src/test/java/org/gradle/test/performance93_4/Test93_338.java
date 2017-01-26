package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_338 {
    private final Production93_338 production = new Production93_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}