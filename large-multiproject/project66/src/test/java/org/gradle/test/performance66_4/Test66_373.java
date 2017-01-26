package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_373 {
    private final Production66_373 production = new Production66_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}