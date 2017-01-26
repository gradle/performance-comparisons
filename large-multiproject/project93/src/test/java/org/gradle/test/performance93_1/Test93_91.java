package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_91 {
    private final Production93_91 production = new Production93_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}