package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_196 {
    private final Production52_196 production = new Production52_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}