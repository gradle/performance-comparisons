package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_339 {
    private final Production97_339 production = new Production97_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}