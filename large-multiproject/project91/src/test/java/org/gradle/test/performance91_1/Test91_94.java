package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_94 {
    private final Production91_94 production = new Production91_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}