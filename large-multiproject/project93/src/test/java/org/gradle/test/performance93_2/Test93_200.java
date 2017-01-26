package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_200 {
    private final Production93_200 production = new Production93_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}