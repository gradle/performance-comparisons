package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_149 {
    private final Production91_149 production = new Production91_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}