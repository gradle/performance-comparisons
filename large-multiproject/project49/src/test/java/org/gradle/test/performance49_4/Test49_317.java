package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_317 {
    private final Production49_317 production = new Production49_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}