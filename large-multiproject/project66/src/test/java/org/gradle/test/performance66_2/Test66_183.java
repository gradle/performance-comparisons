package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_183 {
    private final Production66_183 production = new Production66_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}