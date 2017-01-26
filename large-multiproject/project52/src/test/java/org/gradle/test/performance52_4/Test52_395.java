package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_395 {
    private final Production52_395 production = new Production52_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}