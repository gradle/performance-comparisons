package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_30 {
    private final Production20_30 production = new Production20_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}