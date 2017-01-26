package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_176 {
    private final Production52_176 production = new Production52_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}