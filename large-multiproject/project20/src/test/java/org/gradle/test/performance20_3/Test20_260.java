package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_260 {
    private final Production20_260 production = new Production20_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}