package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_419 {
    private final Production20_419 production = new Production20_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}