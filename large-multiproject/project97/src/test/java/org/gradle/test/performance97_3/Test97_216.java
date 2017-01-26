package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_216 {
    private final Production97_216 production = new Production97_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}