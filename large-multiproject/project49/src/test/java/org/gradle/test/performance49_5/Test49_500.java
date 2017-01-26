package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_500 {
    private final Production49_500 production = new Production49_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}