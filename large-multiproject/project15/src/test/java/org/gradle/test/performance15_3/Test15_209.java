package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_209 {
    private final Production15_209 production = new Production15_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}