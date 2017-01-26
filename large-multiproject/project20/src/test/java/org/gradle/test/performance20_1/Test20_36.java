package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_36 {
    private final Production20_36 production = new Production20_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}