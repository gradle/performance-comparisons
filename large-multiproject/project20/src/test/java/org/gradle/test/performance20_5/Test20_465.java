package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_465 {
    private final Production20_465 production = new Production20_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}