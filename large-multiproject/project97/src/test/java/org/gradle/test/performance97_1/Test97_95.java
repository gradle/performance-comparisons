package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_95 {
    private final Production97_95 production = new Production97_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}