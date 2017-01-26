package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_46 {
    private final Production20_46 production = new Production20_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}