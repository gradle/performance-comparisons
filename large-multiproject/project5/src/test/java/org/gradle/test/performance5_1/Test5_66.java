package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_66 {
    private final Production5_66 production = new Production5_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}