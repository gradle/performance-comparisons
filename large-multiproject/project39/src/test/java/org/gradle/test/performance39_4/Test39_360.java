package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_360 {
    private final Production39_360 production = new Production39_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}