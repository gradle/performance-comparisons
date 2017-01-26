package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_46 {
    private final Production66_46 production = new Production66_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}