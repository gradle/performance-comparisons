package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_213 {
    private final Production97_213 production = new Production97_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}