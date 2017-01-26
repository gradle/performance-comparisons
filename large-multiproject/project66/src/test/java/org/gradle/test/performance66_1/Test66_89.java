package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_89 {
    private final Production66_89 production = new Production66_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}