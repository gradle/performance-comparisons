package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_25 {
    private final Production97_25 production = new Production97_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}