package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_326 {
    private final Production36_326 production = new Production36_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}