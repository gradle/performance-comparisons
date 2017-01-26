package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_367 {
    private final Production52_367 production = new Production52_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}