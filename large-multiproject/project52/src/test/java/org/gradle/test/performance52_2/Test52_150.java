package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_150 {
    private final Production52_150 production = new Production52_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}