package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_116 {
    private final Production91_116 production = new Production91_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}