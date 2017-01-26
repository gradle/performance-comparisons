package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_98 {
    private final Production66_98 production = new Production66_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}