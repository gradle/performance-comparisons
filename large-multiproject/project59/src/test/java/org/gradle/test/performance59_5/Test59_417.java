package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_417 {
    private final Production59_417 production = new Production59_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}