package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_196 {
    private final Production66_196 production = new Production66_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}