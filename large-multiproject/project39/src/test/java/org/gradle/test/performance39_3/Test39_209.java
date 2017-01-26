package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_209 {
    private final Production39_209 production = new Production39_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}