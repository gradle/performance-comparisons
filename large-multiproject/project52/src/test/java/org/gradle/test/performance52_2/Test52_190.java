package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_190 {
    private final Production52_190 production = new Production52_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}