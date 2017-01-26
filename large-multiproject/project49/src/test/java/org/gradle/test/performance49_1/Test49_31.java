package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_31 {
    private final Production49_31 production = new Production49_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}