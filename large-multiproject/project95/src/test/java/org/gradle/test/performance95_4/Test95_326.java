package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_326 {
    private final Production95_326 production = new Production95_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}