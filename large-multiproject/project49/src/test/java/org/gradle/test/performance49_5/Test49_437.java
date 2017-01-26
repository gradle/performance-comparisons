package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_437 {
    private final Production49_437 production = new Production49_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}