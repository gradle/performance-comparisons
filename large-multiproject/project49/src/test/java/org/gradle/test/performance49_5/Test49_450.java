package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_450 {
    private final Production49_450 production = new Production49_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}