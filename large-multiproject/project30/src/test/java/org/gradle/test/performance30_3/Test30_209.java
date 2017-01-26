package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_209 {
    private final Production30_209 production = new Production30_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}