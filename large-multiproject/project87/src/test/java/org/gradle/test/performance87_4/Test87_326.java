package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_326 {
    private final Production87_326 production = new Production87_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}