package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_250 {
    private final Production91_250 production = new Production91_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}