package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_396 {
    private final Production49_396 production = new Production49_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}