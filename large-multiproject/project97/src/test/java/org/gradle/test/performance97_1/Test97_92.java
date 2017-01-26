package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_92 {
    private final Production97_92 production = new Production97_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}