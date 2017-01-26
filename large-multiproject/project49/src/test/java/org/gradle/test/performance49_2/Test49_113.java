package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_113 {
    private final Production49_113 production = new Production49_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}