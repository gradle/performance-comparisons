package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_203 {
    private final Production49_203 production = new Production49_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}