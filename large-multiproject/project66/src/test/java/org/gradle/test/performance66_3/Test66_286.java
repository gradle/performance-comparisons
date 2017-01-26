package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_286 {
    private final Production66_286 production = new Production66_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}