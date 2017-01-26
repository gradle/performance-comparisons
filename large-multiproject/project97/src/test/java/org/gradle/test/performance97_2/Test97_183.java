package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_183 {
    private final Production97_183 production = new Production97_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}