package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_37 {
    private final Production49_37 production = new Production49_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}