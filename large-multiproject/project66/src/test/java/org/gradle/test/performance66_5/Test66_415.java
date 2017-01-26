package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_415 {
    private final Production66_415 production = new Production66_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}