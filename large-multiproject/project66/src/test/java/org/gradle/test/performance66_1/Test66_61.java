package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_61 {
    private final Production66_61 production = new Production66_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}