package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_99 {
    private final Production66_99 production = new Production66_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}