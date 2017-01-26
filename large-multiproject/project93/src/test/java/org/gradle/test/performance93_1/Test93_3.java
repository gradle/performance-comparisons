package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_3 {
    private final Production93_3 production = new Production93_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}