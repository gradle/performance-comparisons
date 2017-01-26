package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_39 {
    private final Production66_39 production = new Production66_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}