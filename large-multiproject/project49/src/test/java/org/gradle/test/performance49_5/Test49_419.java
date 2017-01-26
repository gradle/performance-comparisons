package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_419 {
    private final Production49_419 production = new Production49_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}