package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_367 {
    private final Production97_367 production = new Production97_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}