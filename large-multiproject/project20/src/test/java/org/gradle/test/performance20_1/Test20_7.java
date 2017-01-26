package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_7 {
    private final Production20_7 production = new Production20_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}