package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_139 {
    private final Production52_139 production = new Production52_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}