package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_417 {
    private final Production66_417 production = new Production66_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}