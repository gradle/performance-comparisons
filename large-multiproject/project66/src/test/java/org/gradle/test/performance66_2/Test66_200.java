package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_200 {
    private final Production66_200 production = new Production66_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}