package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_115 {
    private final Production91_115 production = new Production91_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}