package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_77 {
    private final Production66_77 production = new Production66_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}