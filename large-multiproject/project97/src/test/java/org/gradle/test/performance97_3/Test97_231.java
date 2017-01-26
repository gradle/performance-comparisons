package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_231 {
    private final Production97_231 production = new Production97_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}