package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_300 {
    private final Production97_300 production = new Production97_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}