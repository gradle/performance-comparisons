package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_435 {
    private final Production97_435 production = new Production97_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}