package org.gradle.test.performance63_1;

import static org.junit.Assert.*;

public class Test63_59 {
    private final Production63_59 production = new Production63_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}