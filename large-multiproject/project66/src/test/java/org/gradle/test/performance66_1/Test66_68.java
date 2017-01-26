package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_68 {
    private final Production66_68 production = new Production66_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}