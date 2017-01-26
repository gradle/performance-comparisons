package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_222 {
    private final Production97_222 production = new Production97_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}