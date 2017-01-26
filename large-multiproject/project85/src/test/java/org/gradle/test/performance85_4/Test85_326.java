package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_326 {
    private final Production85_326 production = new Production85_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}