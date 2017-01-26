package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_54 {
    private final Production49_54 production = new Production49_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}