package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_305 {
    private final Production5_305 production = new Production5_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}