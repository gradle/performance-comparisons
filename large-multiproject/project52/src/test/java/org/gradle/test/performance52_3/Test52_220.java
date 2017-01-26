package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_220 {
    private final Production52_220 production = new Production52_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}