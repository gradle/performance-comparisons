package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_253 {
    private final Production66_253 production = new Production66_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}