package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_356 {
    private final Production5_356 production = new Production5_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}