package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_86 {
    private final Production91_86 production = new Production91_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}