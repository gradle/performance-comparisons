package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_78 {
    private final Production93_78 production = new Production93_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}