package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_90 {
    private final Production66_90 production = new Production66_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}