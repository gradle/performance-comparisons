package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_466 {
    private final Production49_466 production = new Production49_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}