package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_29 {
    private final Production93_29 production = new Production93_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}