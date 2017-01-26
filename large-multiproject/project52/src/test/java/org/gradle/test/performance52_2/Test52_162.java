package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_162 {
    private final Production52_162 production = new Production52_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}