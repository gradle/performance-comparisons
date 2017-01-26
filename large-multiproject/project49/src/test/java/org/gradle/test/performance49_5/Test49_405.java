package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_405 {
    private final Production49_405 production = new Production49_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}