package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_417 {
    private final Production91_417 production = new Production91_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}