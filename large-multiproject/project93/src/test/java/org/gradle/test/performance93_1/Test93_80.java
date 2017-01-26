package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_80 {
    private final Production93_80 production = new Production93_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}