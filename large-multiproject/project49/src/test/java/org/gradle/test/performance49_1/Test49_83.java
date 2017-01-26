package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_83 {
    private final Production49_83 production = new Production49_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}