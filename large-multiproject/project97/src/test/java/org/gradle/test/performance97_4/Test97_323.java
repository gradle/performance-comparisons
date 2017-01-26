package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_323 {
    private final Production97_323 production = new Production97_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}