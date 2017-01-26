package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_280 {
    private final Production91_280 production = new Production91_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}