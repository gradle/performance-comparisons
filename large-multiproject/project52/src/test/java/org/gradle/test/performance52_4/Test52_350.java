package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_350 {
    private final Production52_350 production = new Production52_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}