package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_46 {
    private final Production49_46 production = new Production49_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}