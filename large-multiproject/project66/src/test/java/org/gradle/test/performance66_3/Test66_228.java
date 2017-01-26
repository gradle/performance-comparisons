package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_228 {
    private final Production66_228 production = new Production66_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}