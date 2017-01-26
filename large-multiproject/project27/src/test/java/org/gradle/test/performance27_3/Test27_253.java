package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_253 {
    private final Production27_253 production = new Production27_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}