package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_259 {
    private final Production52_259 production = new Production52_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}