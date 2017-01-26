package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_388 {
    private final Production93_388 production = new Production93_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}