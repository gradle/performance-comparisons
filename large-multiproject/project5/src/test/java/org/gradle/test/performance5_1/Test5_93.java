package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_93 {
    private final Production5_93 production = new Production5_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}