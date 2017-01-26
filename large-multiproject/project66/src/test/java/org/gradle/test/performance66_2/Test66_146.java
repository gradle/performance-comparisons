package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_146 {
    private final Production66_146 production = new Production66_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}