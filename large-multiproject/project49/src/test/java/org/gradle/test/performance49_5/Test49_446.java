package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_446 {
    private final Production49_446 production = new Production49_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}