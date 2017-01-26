package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_379 {
    private final Production97_379 production = new Production97_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}