package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_435 {
    private final Production52_435 production = new Production52_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}