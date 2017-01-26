package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_337 {
    private final Production97_337 production = new Production97_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}