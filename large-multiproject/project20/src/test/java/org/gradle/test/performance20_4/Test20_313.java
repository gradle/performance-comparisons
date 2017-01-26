package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_313 {
    private final Production20_313 production = new Production20_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}