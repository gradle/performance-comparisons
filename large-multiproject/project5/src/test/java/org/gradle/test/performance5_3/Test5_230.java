package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_230 {
    private final Production5_230 production = new Production5_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}