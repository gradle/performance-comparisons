package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_293 {
    private final Production66_293 production = new Production66_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}