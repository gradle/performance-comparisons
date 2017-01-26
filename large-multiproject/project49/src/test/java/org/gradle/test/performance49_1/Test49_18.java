package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_18 {
    private final Production49_18 production = new Production49_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}