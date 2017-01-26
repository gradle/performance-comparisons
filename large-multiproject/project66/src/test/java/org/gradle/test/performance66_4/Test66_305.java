package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_305 {
    private final Production66_305 production = new Production66_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}