package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_495 {
    private final Production66_495 production = new Production66_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}