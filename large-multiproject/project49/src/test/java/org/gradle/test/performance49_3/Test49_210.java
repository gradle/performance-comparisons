package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_210 {
    private final Production49_210 production = new Production49_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}