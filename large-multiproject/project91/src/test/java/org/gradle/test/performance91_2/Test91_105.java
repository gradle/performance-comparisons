package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_105 {
    private final Production91_105 production = new Production91_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}