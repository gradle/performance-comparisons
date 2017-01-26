package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_317 {
    private final Production97_317 production = new Production97_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}