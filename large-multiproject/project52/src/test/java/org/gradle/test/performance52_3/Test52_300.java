package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_300 {
    private final Production52_300 production = new Production52_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}