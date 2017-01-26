package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_4 {
    private final Production66_4 production = new Production66_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}