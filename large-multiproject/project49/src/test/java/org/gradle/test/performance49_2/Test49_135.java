package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_135 {
    private final Production49_135 production = new Production49_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}