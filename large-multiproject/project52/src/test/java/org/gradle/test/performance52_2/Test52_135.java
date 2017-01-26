package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_135 {
    private final Production52_135 production = new Production52_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}