package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_202 {
    private final Production52_202 production = new Production52_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}