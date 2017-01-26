package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_431 {
    private final Production27_431 production = new Production27_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}