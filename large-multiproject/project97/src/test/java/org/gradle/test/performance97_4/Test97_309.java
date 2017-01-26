package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_309 {
    private final Production97_309 production = new Production97_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}