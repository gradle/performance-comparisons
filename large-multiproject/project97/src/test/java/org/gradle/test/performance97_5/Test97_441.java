package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_441 {
    private final Production97_441 production = new Production97_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}