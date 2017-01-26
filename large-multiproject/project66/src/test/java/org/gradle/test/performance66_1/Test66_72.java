package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_72 {
    private final Production66_72 production = new Production66_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}