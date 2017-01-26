package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_127 {
    private final Production49_127 production = new Production49_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}