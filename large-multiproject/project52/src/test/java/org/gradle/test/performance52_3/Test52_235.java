package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_235 {
    private final Production52_235 production = new Production52_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}