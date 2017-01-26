package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_481 {
    private final Production49_481 production = new Production49_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}