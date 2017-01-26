package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_356 {
    private final Production93_356 production = new Production93_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}