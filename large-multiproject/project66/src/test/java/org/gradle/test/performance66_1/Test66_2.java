package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_2 {
    private final Production66_2 production = new Production66_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}