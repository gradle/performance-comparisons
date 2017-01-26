package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_229 {
    private final Production93_229 production = new Production93_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}