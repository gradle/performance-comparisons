package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_418 {
    private final Production97_418 production = new Production97_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}