package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_329 {
    private final Production49_329 production = new Production49_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}