package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_418 {
    private final Production49_418 production = new Production49_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}