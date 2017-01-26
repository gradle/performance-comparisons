package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_351 {
    private final Production66_351 production = new Production66_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}