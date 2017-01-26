package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_187 {
    private final Production52_187 production = new Production52_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}