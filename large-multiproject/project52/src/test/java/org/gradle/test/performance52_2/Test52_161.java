package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_161 {
    private final Production52_161 production = new Production52_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}