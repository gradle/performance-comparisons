package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_337 {
    private final Production52_337 production = new Production52_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}