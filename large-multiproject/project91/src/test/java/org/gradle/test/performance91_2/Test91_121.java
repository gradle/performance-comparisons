package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_121 {
    private final Production91_121 production = new Production91_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}