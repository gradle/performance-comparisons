package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_421 {
    private final Production97_421 production = new Production97_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}