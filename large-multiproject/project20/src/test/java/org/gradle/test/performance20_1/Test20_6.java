package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_6 {
    private final Production20_6 production = new Production20_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}