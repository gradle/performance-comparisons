package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_231 {
    private final Production66_231 production = new Production66_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}