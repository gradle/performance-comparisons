package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_11 {
    private final Production91_11 production = new Production91_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}