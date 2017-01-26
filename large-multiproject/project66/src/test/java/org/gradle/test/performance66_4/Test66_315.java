package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_315 {
    private final Production66_315 production = new Production66_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}