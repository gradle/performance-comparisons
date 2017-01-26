package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_42 {
    private final Production66_42 production = new Production66_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}