package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_129 {
    private final Production91_129 production = new Production91_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}