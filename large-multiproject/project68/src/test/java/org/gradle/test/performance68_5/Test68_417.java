package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_417 {
    private final Production68_417 production = new Production68_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}