package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_417 {
    private final Production29_417 production = new Production29_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}