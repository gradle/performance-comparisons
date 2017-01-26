package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_395 {
    private final Production49_395 production = new Production49_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}