package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_450 {
    private final Production20_450 production = new Production20_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}