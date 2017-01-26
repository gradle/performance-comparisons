package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_465 {
    private final Production30_465 production = new Production30_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}