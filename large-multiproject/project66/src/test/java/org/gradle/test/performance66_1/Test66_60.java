package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_60 {
    private final Production66_60 production = new Production66_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}