package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_325 {
    private final Production66_325 production = new Production66_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}