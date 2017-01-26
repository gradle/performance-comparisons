package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_458 {
    private final Production97_458 production = new Production97_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}