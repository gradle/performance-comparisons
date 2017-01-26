package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_209 {
    private final Production60_209 production = new Production60_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}