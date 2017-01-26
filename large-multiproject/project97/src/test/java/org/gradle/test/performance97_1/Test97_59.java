package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_59 {
    private final Production97_59 production = new Production97_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}