package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_259 {
    private final Production66_259 production = new Production66_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}