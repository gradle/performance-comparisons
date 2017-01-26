package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_99 {
    private final Production93_99 production = new Production93_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}