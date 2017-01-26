package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_474 {
    private final Production97_474 production = new Production97_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}