package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_203 {
    private final Production97_203 production = new Production97_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}