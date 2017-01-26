package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_325 {
    private final Production93_325 production = new Production93_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}