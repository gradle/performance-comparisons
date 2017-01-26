package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_76 {
    private final Production66_76 production = new Production66_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}