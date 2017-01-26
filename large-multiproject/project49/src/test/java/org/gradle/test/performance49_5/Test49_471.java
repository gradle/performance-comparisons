package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_471 {
    private final Production49_471 production = new Production49_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}