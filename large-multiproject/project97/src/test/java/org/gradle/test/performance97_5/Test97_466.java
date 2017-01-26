package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_466 {
    private final Production97_466 production = new Production97_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}