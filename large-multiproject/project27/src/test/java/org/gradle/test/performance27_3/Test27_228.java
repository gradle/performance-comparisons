package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_228 {
    private final Production27_228 production = new Production27_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}