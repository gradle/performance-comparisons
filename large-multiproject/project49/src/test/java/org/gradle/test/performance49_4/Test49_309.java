package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_309 {
    private final Production49_309 production = new Production49_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}