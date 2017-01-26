package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_435 {
    private final Production49_435 production = new Production49_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}