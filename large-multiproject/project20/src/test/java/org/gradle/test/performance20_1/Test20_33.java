package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_33 {
    private final Production20_33 production = new Production20_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}