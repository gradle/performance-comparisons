package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_33 {
    private final Production49_33 production = new Production49_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}