package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_20 {
    private final Production91_20 production = new Production91_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}