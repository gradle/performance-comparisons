package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_313 {
    private final Production97_313 production = new Production97_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}