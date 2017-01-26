package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_479 {
    private final Production97_479 production = new Production97_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}