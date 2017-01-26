package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_384 {
    private final Production91_384 production = new Production91_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}