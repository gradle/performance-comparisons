package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_35 {
    private final Production97_35 production = new Production97_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}