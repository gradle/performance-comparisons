package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_497 {
    private final Production52_497 production = new Production52_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}