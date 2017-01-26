package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_281 {
    private final Production97_281 production = new Production97_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}