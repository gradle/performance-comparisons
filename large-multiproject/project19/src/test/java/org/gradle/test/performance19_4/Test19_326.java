package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_326 {
    private final Production19_326 production = new Production19_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}