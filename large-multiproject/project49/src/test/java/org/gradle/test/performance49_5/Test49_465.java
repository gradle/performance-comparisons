package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_465 {
    private final Production49_465 production = new Production49_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}