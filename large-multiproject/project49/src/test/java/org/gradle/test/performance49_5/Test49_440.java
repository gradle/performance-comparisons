package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_440 {
    private final Production49_440 production = new Production49_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}