package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_432 {
    private final Production97_432 production = new Production97_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}