package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_172 {
    private final Production93_172 production = new Production93_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}