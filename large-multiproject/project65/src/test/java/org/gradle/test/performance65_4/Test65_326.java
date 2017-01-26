package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_326 {
    private final Production65_326 production = new Production65_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}