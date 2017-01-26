package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_358 {
    private final Production66_358 production = new Production66_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}