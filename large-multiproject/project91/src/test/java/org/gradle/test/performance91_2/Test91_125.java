package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_125 {
    private final Production91_125 production = new Production91_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}