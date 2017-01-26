package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_337 {
    private final Production49_337 production = new Production49_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}