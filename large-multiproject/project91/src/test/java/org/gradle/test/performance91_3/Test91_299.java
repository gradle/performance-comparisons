package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_299 {
    private final Production91_299 production = new Production91_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}