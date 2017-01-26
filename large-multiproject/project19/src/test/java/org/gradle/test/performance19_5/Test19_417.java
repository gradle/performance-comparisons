package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_417 {
    private final Production19_417 production = new Production19_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}