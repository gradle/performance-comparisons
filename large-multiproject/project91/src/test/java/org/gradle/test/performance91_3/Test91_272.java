package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_272 {
    private final Production91_272 production = new Production91_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}