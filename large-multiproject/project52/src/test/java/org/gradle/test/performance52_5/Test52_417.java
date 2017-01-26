package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_417 {
    private final Production52_417 production = new Production52_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}