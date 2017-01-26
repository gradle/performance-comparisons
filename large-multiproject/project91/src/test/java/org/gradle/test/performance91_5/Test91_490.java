package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_490 {
    private final Production91_490 production = new Production91_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}