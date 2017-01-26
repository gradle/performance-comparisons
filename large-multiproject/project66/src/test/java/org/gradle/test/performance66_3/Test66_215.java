package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_215 {
    private final Production66_215 production = new Production66_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}