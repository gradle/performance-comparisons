package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_455 {
    private final Production97_455 production = new Production97_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}