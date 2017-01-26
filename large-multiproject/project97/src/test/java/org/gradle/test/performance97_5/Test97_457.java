package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_457 {
    private final Production97_457 production = new Production97_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}