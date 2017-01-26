package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_364 {
    private final Production66_364 production = new Production66_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}