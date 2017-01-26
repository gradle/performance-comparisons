package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_76 {
    private final Production93_76 production = new Production93_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}