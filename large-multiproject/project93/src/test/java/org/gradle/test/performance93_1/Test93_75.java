package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_75 {
    private final Production93_75 production = new Production93_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}