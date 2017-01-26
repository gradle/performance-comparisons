package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_341 {
    private final Production91_341 production = new Production91_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}