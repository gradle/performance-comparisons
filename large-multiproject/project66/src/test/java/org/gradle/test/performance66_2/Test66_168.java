package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_168 {
    private final Production66_168 production = new Production66_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}