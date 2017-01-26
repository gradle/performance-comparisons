package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_373 {
    private final Production52_373 production = new Production52_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}