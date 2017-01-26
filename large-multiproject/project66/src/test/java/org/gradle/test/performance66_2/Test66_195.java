package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_195 {
    private final Production66_195 production = new Production66_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}