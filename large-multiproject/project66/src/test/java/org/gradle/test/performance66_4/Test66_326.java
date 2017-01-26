package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_326 {
    private final Production66_326 production = new Production66_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}