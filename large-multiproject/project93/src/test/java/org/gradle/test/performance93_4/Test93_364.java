package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_364 {
    private final Production93_364 production = new Production93_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}