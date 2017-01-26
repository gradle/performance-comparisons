package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_320 {
    private final Production66_320 production = new Production66_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}