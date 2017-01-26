package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_164 {
    private final Production49_164 production = new Production49_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}