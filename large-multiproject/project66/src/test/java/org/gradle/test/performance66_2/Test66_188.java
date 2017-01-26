package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_188 {
    private final Production66_188 production = new Production66_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}