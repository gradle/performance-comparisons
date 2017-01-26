package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_323 {
    private final Production20_323 production = new Production20_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}