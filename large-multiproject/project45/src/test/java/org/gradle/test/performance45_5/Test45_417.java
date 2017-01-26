package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_417 {
    private final Production45_417 production = new Production45_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}