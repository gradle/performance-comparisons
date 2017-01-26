package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_214 {
    private final Production66_214 production = new Production66_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}