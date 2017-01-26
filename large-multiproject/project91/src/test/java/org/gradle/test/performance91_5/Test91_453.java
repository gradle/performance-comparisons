package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_453 {
    private final Production91_453 production = new Production91_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}