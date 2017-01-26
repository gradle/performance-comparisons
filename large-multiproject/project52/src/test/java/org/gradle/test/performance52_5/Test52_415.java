package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_415 {
    private final Production52_415 production = new Production52_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}