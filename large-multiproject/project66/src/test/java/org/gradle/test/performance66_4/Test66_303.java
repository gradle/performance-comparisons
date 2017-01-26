package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_303 {
    private final Production66_303 production = new Production66_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}