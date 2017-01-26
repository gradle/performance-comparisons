package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_281 {
    private final Production52_281 production = new Production52_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}