package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_422 {
    private final Production52_422 production = new Production52_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}