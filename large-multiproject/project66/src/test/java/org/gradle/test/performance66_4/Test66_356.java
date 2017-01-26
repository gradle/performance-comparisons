package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_356 {
    private final Production66_356 production = new Production66_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}