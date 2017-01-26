package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_417 {
    private final Production51_417 production = new Production51_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}