package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_326 {
    private final Production64_326 production = new Production64_326("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}