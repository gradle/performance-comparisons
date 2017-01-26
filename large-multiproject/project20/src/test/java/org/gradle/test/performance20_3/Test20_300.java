package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_300 {
    private final Production20_300 production = new Production20_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}