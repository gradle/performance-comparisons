package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_135 {
    private final Production91_135 production = new Production91_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}