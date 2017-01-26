package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_476 {
    private final Production49_476 production = new Production49_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}