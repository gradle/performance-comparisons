package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_432 {
    private final Production66_432 production = new Production66_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}