package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_1 {
    private final Production97_1 production = new Production97_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}