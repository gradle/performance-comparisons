package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_261 {
    private final Production91_261 production = new Production91_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}