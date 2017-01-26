package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_308 {
    private final Production91_308 production = new Production91_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}