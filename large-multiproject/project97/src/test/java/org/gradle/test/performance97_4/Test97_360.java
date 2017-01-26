package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_360 {
    private final Production97_360 production = new Production97_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}