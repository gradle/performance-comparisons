package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_326 {
    private final Production17_326 production = new Production17_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}