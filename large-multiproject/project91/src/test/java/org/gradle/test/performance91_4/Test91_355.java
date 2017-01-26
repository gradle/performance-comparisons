package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_355 {
    private final Production91_355 production = new Production91_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}