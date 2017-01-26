package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_256 {
    private final Production91_256 production = new Production91_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}