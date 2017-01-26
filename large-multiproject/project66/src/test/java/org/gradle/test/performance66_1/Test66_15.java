package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_15 {
    private final Production66_15 production = new Production66_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}