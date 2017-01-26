package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_347 {
    private final Production93_347 production = new Production93_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}