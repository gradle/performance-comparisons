package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_78 {
    private final Production66_78 production = new Production66_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}