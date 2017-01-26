package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_267 {
    private final Production66_267 production = new Production66_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}