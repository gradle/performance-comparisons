package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_434 {
    private final Production49_434 production = new Production49_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}