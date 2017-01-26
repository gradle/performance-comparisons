package org.gradle.test.performance59_4;

import static org.junit.Assert.*;

public class Test59_326 {
    private final Production59_326 production = new Production59_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}