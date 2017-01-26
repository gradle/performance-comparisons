package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_102 {
    private final Production66_102 production = new Production66_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}