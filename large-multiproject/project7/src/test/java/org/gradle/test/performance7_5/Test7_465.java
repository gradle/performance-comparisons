package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_465 {
    private final Production7_465 production = new Production7_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}