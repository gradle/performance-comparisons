package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_437 {
    private final Production97_437 production = new Production97_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}