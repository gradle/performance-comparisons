package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_40 {
    private final Production93_40 production = new Production93_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}