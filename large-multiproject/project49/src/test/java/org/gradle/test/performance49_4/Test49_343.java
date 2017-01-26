package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_343 {
    private final Production49_343 production = new Production49_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}