package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_413 {
    private final Production91_413 production = new Production91_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}