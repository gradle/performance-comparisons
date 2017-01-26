package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_157 {
    private final Production39_157 production = new Production39_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}