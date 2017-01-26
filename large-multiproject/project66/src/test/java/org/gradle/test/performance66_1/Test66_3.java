package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_3 {
    private final Production66_3 production = new Production66_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}