package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_100 {
    private final Production66_100 production = new Production66_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}