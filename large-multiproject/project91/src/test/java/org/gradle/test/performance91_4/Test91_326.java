package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_326 {
    private final Production91_326 production = new Production91_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}