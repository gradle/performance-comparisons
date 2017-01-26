package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_323 {
    private final Production52_323 production = new Production52_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}