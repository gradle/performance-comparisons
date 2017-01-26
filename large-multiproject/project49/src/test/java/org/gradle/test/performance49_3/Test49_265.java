package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_265 {
    private final Production49_265 production = new Production49_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}