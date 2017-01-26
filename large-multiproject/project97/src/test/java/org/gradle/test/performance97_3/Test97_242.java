package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_242 {
    private final Production97_242 production = new Production97_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}