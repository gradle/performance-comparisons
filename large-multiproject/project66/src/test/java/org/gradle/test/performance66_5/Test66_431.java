package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_431 {
    private final Production66_431 production = new Production66_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}