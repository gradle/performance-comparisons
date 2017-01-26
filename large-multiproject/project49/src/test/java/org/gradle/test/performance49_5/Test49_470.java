package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_470 {
    private final Production49_470 production = new Production49_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}