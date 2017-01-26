package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_435 {
    private final Production20_435 production = new Production20_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}