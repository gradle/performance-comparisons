package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_381 {
    private final Production49_381 production = new Production49_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}