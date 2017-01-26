package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_9 {
    private final Production93_9 production = new Production93_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}