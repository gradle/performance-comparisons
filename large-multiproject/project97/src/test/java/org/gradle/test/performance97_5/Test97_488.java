package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_488 {
    private final Production97_488 production = new Production97_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}