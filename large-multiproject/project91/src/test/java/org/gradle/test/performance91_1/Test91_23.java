package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_23 {
    private final Production91_23 production = new Production91_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}