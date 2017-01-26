package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_326 {
    private final Production2_326 production = new Production2_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}