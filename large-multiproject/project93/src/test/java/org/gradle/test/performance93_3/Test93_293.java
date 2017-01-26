package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_293 {
    private final Production93_293 production = new Production93_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}