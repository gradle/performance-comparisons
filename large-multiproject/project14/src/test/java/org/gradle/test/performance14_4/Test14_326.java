package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_326 {
    private final Production14_326 production = new Production14_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}