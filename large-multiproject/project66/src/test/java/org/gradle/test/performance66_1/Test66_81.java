package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_81 {
    private final Production66_81 production = new Production66_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}