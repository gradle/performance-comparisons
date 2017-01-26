package org.gradle.test.performance39_4;

import static org.junit.Assert.*;

public class Test39_347 {
    private final Production39_347 production = new Production39_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}