package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_423 {
    private final Production97_423 production = new Production97_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}