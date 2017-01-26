package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_374 {
    private final Production34_374 production = new Production34_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}