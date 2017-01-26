package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_10 {
    private final Production66_10 production = new Production66_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}