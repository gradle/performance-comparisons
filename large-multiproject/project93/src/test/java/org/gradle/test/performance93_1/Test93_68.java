package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_68 {
    private final Production93_68 production = new Production93_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}