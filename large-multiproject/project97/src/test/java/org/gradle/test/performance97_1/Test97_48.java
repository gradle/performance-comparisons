package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_48 {
    private final Production97_48 production = new Production97_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}