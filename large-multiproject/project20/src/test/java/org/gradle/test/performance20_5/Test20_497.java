package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_497 {
    private final Production20_497 production = new Production20_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}