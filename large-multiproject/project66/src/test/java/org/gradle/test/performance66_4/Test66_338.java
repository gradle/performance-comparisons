package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_338 {
    private final Production66_338 production = new Production66_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}