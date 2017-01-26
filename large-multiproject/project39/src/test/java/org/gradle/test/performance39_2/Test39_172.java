package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_172 {
    private final Production39_172 production = new Production39_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}