package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_74 {
    private final Production97_74 production = new Production97_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}