package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_171 {
    private final Production49_171 production = new Production49_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}