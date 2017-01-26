package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_45 {
    private final Production66_45 production = new Production66_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}