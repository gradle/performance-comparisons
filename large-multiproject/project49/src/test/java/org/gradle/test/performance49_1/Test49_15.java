package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_15 {
    private final Production49_15 production = new Production49_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}