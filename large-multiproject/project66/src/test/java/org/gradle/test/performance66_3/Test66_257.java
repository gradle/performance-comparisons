package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_257 {
    private final Production66_257 production = new Production66_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}