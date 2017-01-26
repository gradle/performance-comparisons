package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_323 {
    private final Production58_323 production = new Production58_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}