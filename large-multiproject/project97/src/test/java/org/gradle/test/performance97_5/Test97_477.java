package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_477 {
    private final Production97_477 production = new Production97_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}