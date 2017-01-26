package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_182 {
    private final Production52_182 production = new Production52_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}