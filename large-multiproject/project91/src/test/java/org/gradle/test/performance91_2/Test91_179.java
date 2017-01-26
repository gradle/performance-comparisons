package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_179 {
    private final Production91_179 production = new Production91_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}