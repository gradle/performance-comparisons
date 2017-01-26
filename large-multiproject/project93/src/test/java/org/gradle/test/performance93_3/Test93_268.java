package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_268 {
    private final Production93_268 production = new Production93_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}