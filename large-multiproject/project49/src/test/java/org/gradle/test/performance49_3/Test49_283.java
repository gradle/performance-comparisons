package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_283 {
    private final Production49_283 production = new Production49_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}