package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_477 {
    private final Production49_477 production = new Production49_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}