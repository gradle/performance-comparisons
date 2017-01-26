package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_238 {
    private final Production52_238 production = new Production52_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}