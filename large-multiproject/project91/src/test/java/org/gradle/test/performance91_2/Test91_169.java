package org.gradle.test.performance91_2;

import static org.junit.Assert.*;

public class Test91_169 {
    private final Production91_169 production = new Production91_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}