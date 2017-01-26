package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_72 {
    private final Production93_72 production = new Production93_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}