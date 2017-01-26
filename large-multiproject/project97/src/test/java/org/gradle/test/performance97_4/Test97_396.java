package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_396 {
    private final Production97_396 production = new Production97_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}