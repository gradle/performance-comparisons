package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_306 {
    private final Production66_306 production = new Production66_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}