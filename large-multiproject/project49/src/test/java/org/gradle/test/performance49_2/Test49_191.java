package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_191 {
    private final Production49_191 production = new Production49_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}