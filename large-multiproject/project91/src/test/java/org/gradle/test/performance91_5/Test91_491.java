package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_491 {
    private final Production91_491 production = new Production91_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}