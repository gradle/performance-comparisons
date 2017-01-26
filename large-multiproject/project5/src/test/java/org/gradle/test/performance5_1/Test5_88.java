package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_88 {
    private final Production5_88 production = new Production5_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}