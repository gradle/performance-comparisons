package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_157 {
    private final Production93_157 production = new Production93_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}