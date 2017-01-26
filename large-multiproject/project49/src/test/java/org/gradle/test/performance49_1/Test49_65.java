package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_65 {
    private final Production49_65 production = new Production49_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}