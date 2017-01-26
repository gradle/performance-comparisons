package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_60 {
    private final Production20_60 production = new Production20_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}