package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_405 {
    private final Production97_405 production = new Production97_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}