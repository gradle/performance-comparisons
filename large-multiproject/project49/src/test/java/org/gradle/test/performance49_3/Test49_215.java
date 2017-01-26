package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_215 {
    private final Production49_215 production = new Production49_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}