package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_488 {
    private final Production49_488 production = new Production49_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}