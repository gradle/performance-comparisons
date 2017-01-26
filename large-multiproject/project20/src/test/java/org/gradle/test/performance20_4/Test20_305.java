package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_305 {
    private final Production20_305 production = new Production20_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}