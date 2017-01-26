package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_209 {
    private final Production27_209 production = new Production27_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}