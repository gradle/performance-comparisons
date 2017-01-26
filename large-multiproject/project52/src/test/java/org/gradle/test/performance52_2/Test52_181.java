package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_181 {
    private final Production52_181 production = new Production52_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}