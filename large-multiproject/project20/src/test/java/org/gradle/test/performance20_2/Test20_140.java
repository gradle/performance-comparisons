package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_140 {
    private final Production20_140 production = new Production20_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}