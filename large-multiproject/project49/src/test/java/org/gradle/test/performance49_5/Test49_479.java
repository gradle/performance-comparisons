package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_479 {
    private final Production49_479 production = new Production49_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}