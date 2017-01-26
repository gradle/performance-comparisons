package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_53 {
    private final Production20_53 production = new Production20_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}