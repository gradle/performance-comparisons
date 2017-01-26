package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_63 {
    private final Production49_63 production = new Production49_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}