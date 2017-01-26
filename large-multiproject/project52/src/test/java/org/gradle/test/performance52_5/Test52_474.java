package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_474 {
    private final Production52_474 production = new Production52_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}