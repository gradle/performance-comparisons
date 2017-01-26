package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_392 {
    private final Production66_392 production = new Production66_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}