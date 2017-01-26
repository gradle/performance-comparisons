package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_417 {
    private final Production65_417 production = new Production65_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}