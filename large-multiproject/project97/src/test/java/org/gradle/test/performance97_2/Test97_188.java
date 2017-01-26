package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_188 {
    private final Production97_188 production = new Production97_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}