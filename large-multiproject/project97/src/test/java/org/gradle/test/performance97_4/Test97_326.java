package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_326 {
    private final Production97_326 production = new Production97_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}