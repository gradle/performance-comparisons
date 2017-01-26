package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_251 {
    private final Production93_251 production = new Production93_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}