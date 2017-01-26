package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_447 {
    private final Production52_447 production = new Production52_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}