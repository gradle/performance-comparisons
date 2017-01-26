package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_51 {
    private final Production49_51 production = new Production49_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}