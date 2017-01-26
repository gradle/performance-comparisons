package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_266 {
    private final Production66_266 production = new Production66_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}