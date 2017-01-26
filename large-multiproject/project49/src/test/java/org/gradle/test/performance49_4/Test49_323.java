package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_323 {
    private final Production49_323 production = new Production49_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}